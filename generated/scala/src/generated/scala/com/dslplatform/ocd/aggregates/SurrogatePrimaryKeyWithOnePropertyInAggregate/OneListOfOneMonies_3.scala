package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneMonies_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneMonies: IndexedSeq[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneMonies_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneMonies_3("+ URI +")"

   def copy(oneListOfOneMonies: IndexedSeq[BigDecimal] = this._oneListOfOneMonies): OneListOfOneMonies_3 = {

  require(oneListOfOneMonies ne null, "Null value was provided for property \"oneListOfOneMonies\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMonies)
    new OneListOfOneMonies_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneMonies = oneListOfOneMonies)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneMonies_3): this.type = {
    this._URI = result._URI
    this._oneListOfOneMonies = result._oneListOfOneMonies
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneMonies_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneMonies = {
    _oneListOfOneMonies
  }

  def oneListOfOneMonies_= (value: IndexedSeq[BigDecimal]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneMonies = value

    _oneListOfOneMonies = com.dslplatform.api.Guards.setCollectionScale(_oneListOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMonies") oneListOfOneMonies: IndexedSeq[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneMonies = if (oneListOfOneMonies == null) IndexedSeq.empty else oneListOfOneMonies)

}

object OneListOfOneMonies_3 extends AggregateRootCompanion[OneListOfOneMonies_3]{

  def apply(
    oneListOfOneMonies: IndexedSeq[BigDecimal] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMonies)
    require(oneListOfOneMonies ne null, "Null value was provided for property \"oneListOfOneMonies\"")
    new OneListOfOneMonies_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneMonies = oneListOfOneMonies)
  }

}
