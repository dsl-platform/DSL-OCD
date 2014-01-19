package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneMonies_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfOneMonies: IndexedSeq[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneMonies_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneMonies_2("+ URI +")"

   def copy(oneListOfOneMonies: IndexedSeq[BigDecimal] = this._oneListOfOneMonies): OneListOfOneMonies_2 = {

  require(oneListOfOneMonies ne null, "Null value was provided for property \"oneListOfOneMonies\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMonies)
    new OneListOfOneMonies_2(_URI = this.URI, __locator = this.__locator, _oneListOfOneMonies = oneListOfOneMonies)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneMonies_2): this.type = {
    this._URI = result._URI
    this._oneListOfOneMonies = result._oneListOfOneMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneMonies_2](URI), duration)
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
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMonies") oneListOfOneMonies: IndexedSeq[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfOneMonies = if (oneListOfOneMonies == null) IndexedSeq.empty else oneListOfOneMonies)

}

object OneListOfOneMonies_2 extends AggregateRootCompanion[OneListOfOneMonies_2]{

  def apply(
    oneListOfOneMonies: IndexedSeq[BigDecimal] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMonies)
    require(oneListOfOneMonies ne null, "Null value was provided for property \"oneListOfOneMonies\"")
    new OneListOfOneMonies_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfOneMonies = oneListOfOneMonies)
  }

}