package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableMonies_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableMonies_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableMonies_2("+ URI +")"

   def copy(oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]] = this._oneListOfNullableMonies): OneListOfNullableMonies_2 = {

  require(oneListOfNullableMonies ne null, "Null value was provided for property \"oneListOfNullableMonies\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMonies)
    new OneListOfNullableMonies_2(_URI = this.URI, __locator = this.__locator, _oneListOfNullableMonies = oneListOfNullableMonies)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableMonies_2): this.type = {
    this._URI = result._URI
    this._oneListOfNullableMonies = result._oneListOfNullableMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableMonies_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableMonies = {
    _oneListOfNullableMonies
  }

  def oneListOfNullableMonies_= (value: IndexedSeq[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableMonies = value

    _oneListOfNullableMonies = com.dslplatform.api.Guards.setCollectionOptionScale(_oneListOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMonies") oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfNullableMonies = if (oneListOfNullableMonies == null) IndexedSeq.empty else oneListOfNullableMonies)

}

object OneListOfNullableMonies_2 extends AggregateRootCompanion[OneListOfNullableMonies_2]{

  def apply(
    oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMonies)
    require(oneListOfNullableMonies ne null, "Null value was provided for property \"oneListOfNullableMonies\"")
    new OneListOfNullableMonies_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfNullableMonies = oneListOfNullableMonies)
  }

}
