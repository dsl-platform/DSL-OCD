package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneMonies_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneMonies: Set[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneMonies_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneMonies_3("+ URI +")"

   def copy(oneSetOfOneMonies: Set[BigDecimal] = this._oneSetOfOneMonies): OneSetOfOneMonies_3 = {

  require(oneSetOfOneMonies ne null, "Null value was provided for property \"oneSetOfOneMonies\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMonies)
    new OneSetOfOneMonies_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneMonies = oneSetOfOneMonies)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneMonies_3): this.type = {
    this._URI = result._URI
    this._oneSetOfOneMonies = result._oneSetOfOneMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneMonies_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneMonies = {
    _oneSetOfOneMonies
  }

  def oneSetOfOneMonies_= (value: Set[BigDecimal]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneMonies = value

    _oneSetOfOneMonies = com.dslplatform.api.Guards.setCollectionScale(_oneSetOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMonies") oneSetOfOneMonies: Set[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneMonies = if (oneSetOfOneMonies == null) Set.empty else oneSetOfOneMonies)

}

object OneSetOfOneMonies_3 extends AggregateRootCompanion[OneSetOfOneMonies_3]{

  def apply(
    oneSetOfOneMonies: Set[BigDecimal] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMonies)
    require(oneSetOfOneMonies ne null, "Null value was provided for property \"oneSetOfOneMonies\"")
    new OneSetOfOneMonies_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneMonies = oneSetOfOneMonies)
  }

}
